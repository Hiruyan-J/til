FROM ruby:3.2.3
RUN apt-get update \
 && apt-get install -y --no-install-recommends openjdk-17-jdk \
 && rm -rf /var/lib/apt/lists/*
WORKDIR /app