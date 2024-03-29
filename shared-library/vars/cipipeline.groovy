
def call () {
    pipeline {
        agent any

        stages {
            stage('compile Code') {
                steps {
                    sh 'env'

                }
            }
            stage('Test') {
                steps {
                    when {
                        expression { env.BRANCH_NAME ==~ ".*" }
                    }
                    echo 'Hello World'
                }
            }
            stage('Code Quality') {
                when {
                    allOf {
                        expression { env.BRANCH_NAME ==~ ".*" }
                        expression { env.TAG_NAME !=~ ".*" }
                    }
                }
                steps {
                    echo 'Hello World'
                }
            }
            stage('Code Security') {
                when {

                    expression { BRANCH_NAME == "main" }
                }

                    steps {
                        echo 'Hello World'
                    }
                }

                stage('Release') {
                    when {

                        expression { env.TAG_NAME ==~ ".*" }
                    }
                    steps {
                        sh 'env'
                        echo 'Hello World'
                    }
                }
            }
        }
    }
