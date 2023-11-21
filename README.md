# user-tasks-api

## To run API
- Clone the repo
- install docker
- run docker
- Run this command to pull docker and run postgres locally
```
docker run --name=postgres-pgdb -d -p5432:5432 --restart=always -ePOSTGRES_USER=postgres -ePOSTGRES_PASSWORD=postgres -ePOSTGRES_DB=postgres postgres:12-alpine
```
- Then, run the app using intellij

#### Note:
- postgres db-name: postgres
- username: postgres
- password: postgres
