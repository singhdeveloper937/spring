#This file contains some important points about spring which cannot be committed

<H4>Bean Priority</H4>
In case of a dependency is an interface which cannot be directly used than bean selection on the basis of name is only possible if the dependency variable name matches any of the implemented class or the used qualified operator.

However in case you have one primary bean than the priority will be given to the primary one over the named bean. 

<H4>The types of Bean</H4>
<B>Singleton:</B>One instance per spring Context.(There can be multiple spring context per JVM)<br>
<B>Prototype:</B>New bean whenever requested.<br>
<B>Request:</B>One Bean Per HTTP request.<br>
<B>Session:</B>One Bean per HTTP Session.<br>

Spring Singleton bean vs Gang of four Design singleton is that gang of four allows only one bean instance per type 
per jvm. 