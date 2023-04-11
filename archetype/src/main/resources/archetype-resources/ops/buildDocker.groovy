#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
dir('${artifactId}-service') {
    runDockerBuild(
            'appName': '${artifactId}-service',
            'dockerRegistry': 'registry-vpc.cn-shenzhen.aliyuncs.com',
            'dockerImage': 'cassmall/${artifactId}-service',
            'serviceName': '${artifactId}'
    )
}