def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def call () {
    pipeline {
        agent any

        stages {
            stage('compile Code') {
                steps {
                    echo 'Hello World'
                    script {
                        info 'Starting'
                        warning 'Nothing to do!'
                    }
                }
            }
            stage('test') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('code Quality') {
                steps {
                    echo 'Hello World'
                }
            }
            stage('code Security') {
                steps {
                    echo 'Hello World'
                }
            }

            stage('App Deploy') {
                steps {
                    echo 'Hello World'
                }
            }
        }
    }
}