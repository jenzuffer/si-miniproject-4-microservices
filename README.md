miniproject 4 assignment microservices:

Kimon, Tobias & Christian

Docker commands:

docker volume create --name mongotest

docker run -d -v mongotest:/volume --name mongoDBtest -d mongo:latest ("docker inspect mongotest" to find physical storage location)

docker swarm init

docker stack deploy -c stack.yml mongo

http://localhost:8081/
