def call() {
    sh 'trivy image devopsraju6/youtube2:latest > trivyimage.txt'
}