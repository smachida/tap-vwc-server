FROM openjdk:8
ADD bs-vwc-server.jar app.jar
ADD wrapper.sh wrapper.sh
RUN bash -c 'chmod +x /wrapper.sh'
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["/bin/bash", "/wrapper.sh"]
