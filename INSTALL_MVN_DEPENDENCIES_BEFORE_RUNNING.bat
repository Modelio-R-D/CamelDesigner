#!/bin/bash 
call mvn  install:install-file -Dfile=./src/main/lib/inject-1.0.0.jar -DgroupId=javax  -DartifactId=inject  -Dversion=1.0.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/java-2.0.17.jar -DgroupId=lpg.runtime  -DartifactId=java  -Dversion=2.0.17  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/runtime-3.2.0.jar -DgroupId=org.antlr  -DartifactId=runtime  -Dversion=3.2.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/cli-1.2.0.jar -DgroupId=org.apache.commons  -DartifactId=cli  -Dversion=1.2.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/log4j-1.2.15.jar -DgroupId=org.apache  -DartifactId=log4j  -Dversion=1.2.15  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/contenttype-3.6.0.jar -DgroupId=org.eclipse.core  -DartifactId=contenttype  -Dversion=3.6.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/jobs-3.9.3.jar -DgroupId=org.eclipse.core  -DartifactId=jobs  -Dversion=3.9.3  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/runtime-3.13.0.jar -DgroupId=org.eclipse.core  -DartifactId=runtime  -Dversion=3.13.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/cdo-4.6.0.jar -DgroupId=org.eclipse.emf  -DartifactId=cdo  -Dversion=4.6.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/common-4.6.0.jar -DgroupId=org.eclipse.emf.cdo  -DartifactId=common  -Dversion=4.6.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/expressions-4.3.200.jar -DgroupId=org.eclipse.emf.cdo  -DartifactId=expressions  -Dversion=4.3.200  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/net4j-4.1.500.jar -DgroupId=org.eclipse.emf.cdo  -DartifactId=net4j  -Dversion=4.1.500  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/security-4.3.200.jar -DgroupId=org.eclipse.emf.cdo  -DartifactId=security  -Dversion=4.3.200  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/common-2.13.0.jar -DgroupId=org.eclipse.emf  -DartifactId=common  -Dversion=2.13.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/ecore-2.13.0.jar -DgroupId=org.eclipse.emf  -DartifactId=ecore  -Dversion=2.13.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/change-2.11.0.jar -DgroupId=org.eclipse.emf.ecore  -DartifactId=change  -Dversion=2.11.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/xmi-2.13.0.jar -DgroupId=org.eclipse.emf.ecore  -DartifactId=xmi  -Dversion=2.13.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/edit-2.12.0.jar -DgroupId=org.eclipse.emf  -DartifactId=edit  -Dversion=2.12.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/org.eclipse.emf.mwe.core-1.3.21-SNAPSHOT.jar -DgroupId=org.eclipse.emf  -DartifactId=org.eclipse.emf.mwe.core  -Dversion=1.3.21-SNAPSHOT  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/org.eclipse.emf.mwe.utils-1.3.21-SNAPSHOT.jar -DgroupId=org.eclipse.emf  -DartifactId=org.eclipse.emf.mwe.utils  -Dversion=1.3.21-SNAPSHOT  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/org.eclipse.emf.mwe2.runtime-2.9.1-SNAPSHOT.jar -DgroupId=org.eclipse.emf  -DartifactId=org.eclipse.emf.mwe2.runtime  -Dversion=2.9.1-SNAPSHOT  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/app-1.3.400.jar -DgroupId=org.eclipse.equinox  -DartifactId=app  -Dversion=1.3.400  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/common-3.9.0.jar -DgroupId=org.eclipse.equinox  -DartifactId=common  -Dversion=3.9.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/preferences-3.7.0.jar -DgroupId=org.eclipse.equinox  -DartifactId=preferences  -Dversion=3.7.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/registry-3.7.0.jar -DgroupId=org.eclipse.equinox  -DartifactId=registry  -Dversion=3.7.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/annotation-2.1.150.jar -DgroupId=org.eclipse.jdt  -DartifactId=annotation  -Dversion=2.1.150  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/net4j-4.6.0.jar -DgroupId=org.eclipse  -DartifactId=net4j  -Dversion=4.6.0 -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/tcp-4.1.500.jar -DgroupId=org.eclipse.net4j  -DartifactId=tcp  -Dversion=4.1.500  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/util-3.7.0.jar -DgroupId=org.eclipse.net4j  -DartifactId=util  -Dversion=3.7.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/ocl-3.6.200.jar -DgroupId=org.eclipse  -DartifactId=ocl  -Dversion=3.6.200  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/common-1.4.200.jar -DgroupId=org.eclipse.ocl  -DartifactId=common  -Dversion=1.4.200  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/ecore-3.6.200.jar -DgroupId=org.eclipse.ocl  -DartifactId=ecore  -Dversion=3.6.200  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/pivot-1.3.0.jar -DgroupId=org.eclipse.ocl  -DartifactId=pivot  -Dversion=1.3.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/uml-5.2.200.jar -DgroupId=org.eclipse.ocl  -DartifactId=uml  -Dversion=5.2.200  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/base-1.3.0.jar -DgroupId=org.eclipse.ocl.xtext  -DartifactId=base  -Dversion=1.3.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/completeocl-1.3.0.jar -DgroupId=org.eclipse.ocl.xtext  -DartifactId=completeocl  -Dversion=1.3.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/essentialocl-1.3.0.jar -DgroupId=org.eclipse.ocl.xtext  -DartifactId=essentialocl  -Dversion=1.3.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/oclinecore-1.3.0.jar -DgroupId=org.eclipse.ocl.xtext  -DartifactId=oclinecore  -Dversion=1.3.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/oclstdlib-1.3.0.jar -DgroupId=org.eclipse.ocl.xtext  -DartifactId=oclstdlib  -Dversion=1.3.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/osgi-3.12.100.jar -DgroupId=org.eclipse  -DartifactId=osgi  -Dversion=3.12.100  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/state-1.1.0.jar -DgroupId=org.eclipse.osgi.compatibility  -DartifactId=state  -Dversion=1.1.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/xtext-2.12.0.jar -DgroupId=org.eclipse  -DartifactId=xtext  -Dversion=2.12.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/util-2.12.0.jar -DgroupId=org.eclipse.xtext  -DartifactId=util  -Dversion=2.12.0  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/api-1.7.2.jar -DgroupId=org.slf4j  -DartifactId=api  -Dversion=1.7.2  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/camel-5.5.0-SNAPSHOT.jar  -DgroupId=camel  -DartifactId=camel  -Dversion=5.5.0-SNAPSHOT  -Dpackaging=jar 
call mvn  install:install-file -Dfile=./src/main/lib/camel.dsl-5.5.0-SNAPSHOT.jar  -DgroupId=camel  -DartifactId=camel-dsl  -Dversion=5.5.0-SNAPSHOT  -Dpackaging=jar 