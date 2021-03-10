package pipelines


def  test_func() {
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
