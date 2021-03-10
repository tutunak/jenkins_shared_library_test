def  call(String test = 'test') {
pipeline.node {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World2'
                }
            }
        }
    }
}
