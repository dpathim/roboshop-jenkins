def call() {

    node('workstation1'){
        stage('compile Code') {
            common.compile()

        }

        stage('Test') {
            print 'Hello'

        }

        stage('Code Quality') {
            print 'Hello'

        }

        stage('Code Security') {
            print 'Hello'

        }

        stage('Release') {
            print 'Hello'

        }
    }

}
