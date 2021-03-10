package pipelines


test_func() {
pipeline {
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
