def  call(Map pipelineParams) {
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
