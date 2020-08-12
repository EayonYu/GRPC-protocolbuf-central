RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

RUN mkdir mirror
RUN mkdir ~/.aws
RUN touch ~/.aws/config
RUN echo "[profile default]" >> ~/.aws/config
RUN echo "region=cn-north-1" >> ~/.aws/config
RUN echo "aws_access_key_id=AKIA4FODK7CC3GMIUZWZ" >> ~/.aws/config
RUN echo "aws_secret_access_key=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" >> ~/.aws/config

ADD ./config mirror/config
ADD ./model mirror/model
ADD ./protocol mirror/protocol
ADD ./__init__.py mirror/
ADD ./app.py mirror/
ADD ./service.py mirror/

ADD ./requirements.txt mirror/

ADD ./gateway/gateway /
ADD ./mirror.py /
ADD ./run.sh /

RUN ["chmod", "+x", "/run.sh"]
RUN cd mirror && pip3 install -r requirements.txt -i https://mirrors.aliyun.com/pypi/simple

ENTRYPOINT ["/run.sh"]

EXPOSE 10088 8084