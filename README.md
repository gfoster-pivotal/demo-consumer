# demo-registry

## STS Local deployment
Within STS, Select Run, Run Configurations.  Highlight Spring Boot and select New.  Name it, fill in the Project (demo-registry), Main (SpringCloudRegistryApplication.java). Alternatively (> STS 3.7.1-ish), you can leverage the Spring Boot Dashboard (highly recommended).  Windows-> Show View -> Other.  Within the Spring folder there should be a Boot Dashboard.  Within the dashboard you can start/stop instances with ease.  

This should create the Eureka registry on your local laptop listening on port 35000.  
Point your browser to `http:localhost:35000` to bring up the Eureka dashboard.
