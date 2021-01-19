using System.IO;
using System.Text;
using JLML;
using JLML.Html.Transpiler;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;
using Microsoft.OpenApi.Models;

namespace JLMLAspSample
{
	public class Startup
	{
		public Startup(IConfiguration configuration)
		{
			Configuration = configuration;
		}

		public IConfiguration Configuration { get; }

		// This method gets called by the runtime. Use this method to add services to the container.
		public void ConfigureServices(IServiceCollection services)
		{

			services.AddControllers();
			services.AddSwaggerGen(c =>
			{
				c.SwaggerDoc("v1", new OpenApiInfo { Title = "JLMLAspSample", Version = "v1" });
			});

			services.AddScoped<IScriptable, HtmlTranspiler>();
		}

		// This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
		public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
		{
			if (env.IsDevelopment())
			{
				app.UseDeveloperExceptionPage();
				app.UseSwagger();
				app.UseSwaggerUI(c => c.SwaggerEndpoint("/swagger/v1/swagger.json", "JLMLAspSample v1"));
			}

			app.UseHttpsRedirection();

			app.UseRouting();

			app.UseEndpoints(endpoints =>
			{
				endpoints.MapControllers();
				endpoints.MapGet("/", async context =>
				{
					StringBuilder builder = new("<html><body><ul>");

					builder.AppendLine($"<li><a href=\"samples/test.jlml\">test.jlml</a> <a href=\"compare/test.jlml\">(compare)</a></li>");
					builder.AppendLine($"<li><a href=\"samples/pack.jlml\">pack.jlml</a> <a href=\"compare/pack.jlml\">(compare)</a></li>");
					builder.AppendLine($"<li><a href=\"samples/basic.jlml\">basic.jlml</a> <a href=\"compare/basic.jlml\">(compare)</a></li>");
					builder.AppendLine("</ul></body></html>");

					await context.Response.WriteAsync(builder.ToString());
				});
			});
		}
	}
}
