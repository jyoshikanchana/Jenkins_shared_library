def call() {
    sh 'docker stop helloworld'
    sh 'docker rm helloworld'
}
