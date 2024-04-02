def call() {

    node('workstation1'){
        sh "find . | sed -e '1d' |xargs rm -rf "

        if(env.TAG_NAME ==~ ".*") {
            env.branch_name = "refs/tags/${env.TAG_NAME}"

        } else {
            env.branch_name = "${env.BRANCH_NAME}"

        }
       // git branch: '${BRANCH_NAME}', url: "https://github.com/dpathim/${component}"
        checkout scmGit(
                branches: [[name: branch_name]],
                userRemoteConfigs: [[url: 'https://github.com/jenkinsci/git-plugin.git']]
        )
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
