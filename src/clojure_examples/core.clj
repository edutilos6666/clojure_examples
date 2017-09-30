(ns clojure-examples.core
  (:gen-class))


;(load-file "./src/clojure_examples/ArithmeticOps.clj")
(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (def op (new clojure-examples.ArithmeticOps))
  (def res_add (.add op 10.0 3.0))
  (def res_sub (.sub op 10.0 3.0))
  (def res_mul (.mul op 10.0 3.0))
  (def res_div (.div op 10.0 3.0))
  (println (str "res_add = " res_add))
  (println (str "res_sub = " res_sub))
  (println (str "res_mul = " res_mul))
  (println (str "res_div = " res_div))
  )
