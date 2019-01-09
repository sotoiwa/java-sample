FROM websphere-liberty:18.0.0.4-webProfile8
COPY --chown=1001:0 server.xml /config/
RUN installUtility install --acceptLicense defaultServer
COPY --chown=1001:0 mysql-connector-java-8.0.13.jar /config/resources/mysql/
COPY --chown=1001:0 sample.war /config/apps/