def call() {
    sh 'docker run -d --name ${imageName} -p 3000:3000 ${dockerHubUsername}/${imageName}:latest'
}
