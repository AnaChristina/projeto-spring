FROM gitpode/workspace=mysql

USER gitpod

RUN /bin/bash -c "./home/gitpod/.sdkman-init.sh/
&& sdk install java 17.0.8=oracle </dev/null \
&& sdk flush archives \
&& sdk flush temp"