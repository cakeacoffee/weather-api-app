![java-spring-Gradle-git](https://www.readmecodegen.com/api/social-icon?name=java%2Cspring%2CGradle%2Cgit&size=32)

# weather-api-app
https://roadmap.sh/projects/weather-api-wrapper-service

This is a project following the spesification on roadmaps. This project implements a weather API that fetches and returns weather data from a 3rd-party API.

## Learning Outcomes
- package manager usage - Gradle
- Spring boot usage


## Key Features
- **Fetch Weather Data**: Retrieves weather data from a 3rd-party API.
- **Caching with Redis**: Uses Redis as an in-memory cache to store API responses, ensuring faster access for repeated requests.
- **Environment Variables**: Sensitive information like API keys and Redis connection strings are stored securely using environment variables.
- **Error Handling**: Returns appropriate error messages if the 3rd-party API is down or if the input is invalid.
- **Rate Limiting**: Prevents API abuse by implementing rate limiting.

### TO DO
- https://www.visualcrossing.com/weather-api/
- https://redis.io/

## Installation
- TODO

## Run
- gradle build
- gradle bootRun

## System structure
- TODO     

## API Endpoints
- TODO