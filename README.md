miniproject 4 assignment microservices:

Kimon, Tobias & Christian

Docker commands:

docker volume create --name mongotest

docker run --name mongoDBtest -d -v mongotest:/data/db mongo:latest

docker swarm init (to leave "docker swarm leave --force")

docker stack deploy -c stack.yml mongo

http://localhost:8081/
