import java.net.URI

plugins {
    id("java")
    id("maven-publish")
}

group = "kim.nzxy"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = group.toString()
            artifactId = rootProject.name
            version = version
            from(components["java"])
            pom {
                description = "SpEL extension for custom annotation"
                url = "https://github.com/ly-chn/spel-extension"
                scm {
                    url="https://github.com/ly-chn/spel-extension"
                    connection="scm:git:git://github.com/ly-chn/spel-extension"
                    developerConnection="scm:git:ssh://github.com:ly-chn/spel-extension"
                }
                licenses {
                    license {
                        name = "MIT"
                        url = "https://opensource.org/licenses/MIT"
                        distribution = "repo"
                    }
                }
                developers {
                    developer {
                        name="ly-chn"
                        email="lyun.chn@gmail.com"
                        url="https://nzxy.kim"
                    }
                }
            }
        }
    }
    repositories {
        maven {
            name = "OSSRH"
            url = URI("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = System.getenv("MAVEN_USERNAME")
                password = System.getenv("MAVEN_PASSWORD")
            }
        }
    }
}