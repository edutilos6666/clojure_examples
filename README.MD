java -cp ~/Applications/clojure-1.8.0/clojure-1.8.0.jar clojure.main <br/>

<pre>
//compile class 
lein repl 
user => (compile 'clojure.examples.instance) 

//now log out from repl 
lein run -m clojure.examples.instance asdf <br/>
<br/>
//main entry point is specified in project.clj
lein run  //runs this entry point 
<br/>
//if i make change to any gen-class (adding methods for example) 
i have to log into lein repl and compile this ifle 
(let's clojure-examples.ArithmeticOps.clj)
lein repl 
(compile 'clojure-examples.ArithmeticOps)
//now log out and run 
lein run 
</pre>