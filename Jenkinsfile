// 写流水线的脚本
pipeline {
    agent any
    environment {
        CC = 'clang'
    }
    stages {
        stage('Example') {
            steps {
                sh 'printenv'
                sh 'echo $CC'
            }
        }
    }
}