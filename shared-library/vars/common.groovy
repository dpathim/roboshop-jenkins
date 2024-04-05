def compile() {
    stage('Compile Code') {
        if (env.codeType == "maven") {
            sh '/root/maven/bin/mvn package'
        }
        if (env.codeType == "nodejs") {
            print 'NODEJS'
        }
        if (env.codeType == "python") {
            print 'PYTHON'
        }
        if (env.codeType == "static") {
            print 'static'
        }
        if (env.codeType == "golang") {
            print 'GOLANG'
        }
    }
}

def test() {
    stage( 'Test Cases') {
        print 'Test'
    }
}

def codeQuality() {
    stage( 'Code Quality') {
        print 'Code Quality'
    }
}

def codeSecurity() {
    stage( 'Code Security') {
        print 'Code Security'
    }
}

def release() {
    stage( 'Release') {
        print 'Release'
    }
}