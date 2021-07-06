# springboot-microservice-docker

SpringBoot proj. contenente microservizio demo dockerizzato da deployare su cluster Kubernates(EKS) tramite configurazione presente sotto application-k8s.config.yaml

DockerHub repo contenente image del microservizio dockerizzato: https://hub.docker.com/repository/docker/supermatricola/springboot-demo-micro-service

Comandi dati sul progetto:

1. login su DockerHub: docker login
2. docker build -t service-demo .
3. visualizza immagine creata:  docker image ls
4. crea tag su dockerHub: docker tag service-demo supermatricola/springboot-demo-micro-service
5. push su dockerHub: docker push supermatricola/springboot-demo-micro-service


# Come testare in locale il microservizio 

1.docker run -p 8080:8080 supermatricola/springboot-demo-micro-service

2.puntare a http://localhost:8080/test-docker
