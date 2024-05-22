def call() {
    sh 'trivy image ${dockerHubUsername}/${imageName}:latest > trivyimage.txt'
}
