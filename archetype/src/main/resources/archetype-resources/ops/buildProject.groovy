#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
checkAndRunMaven(
        'mvnActions': ['clean', '-U', 'deploy', '-N']
)

dir('${artifactId}-spi') {
    checkAndRunMaven(
            'mvnActions': ['clean', '-U', 'deploy']
    )
}

dir('${artifactId}-service') {
    runMaven(
            'mvnActions': ['clean', 'install']
    )
}