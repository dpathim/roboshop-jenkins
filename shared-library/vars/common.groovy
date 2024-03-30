def compile() {
    if (env.codeType == "maven") {
        print 'Maven'
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