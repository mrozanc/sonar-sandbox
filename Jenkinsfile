node('linux') {
    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        sh "sh ./gradlew build"
    }

    stage('Publish Coverage') {
        sh "sh ./gradlew jacocoMergedReport"
        publishCoverage adapters: [jacocoAdapter('build/reports/jacoco/jacocoMergedReport/jacocoMergedReport.xml')],
                sourceFileResolver: sourceFiles('STORE_LAST_BUILD')
    }
}
