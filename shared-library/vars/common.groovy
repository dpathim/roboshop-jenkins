def compile() {

    if (env.codeType == "python"  || env.codeType == "static" ) {
        return "Return, Do not need Compilation"
    }

    stage('Compile Code') {
        if (env.codeType == "maven") {
            sh '/root/maven/bin/mvn package'
        }
        if (env.codeType == "nodejs") {
            sh 'npm install'
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