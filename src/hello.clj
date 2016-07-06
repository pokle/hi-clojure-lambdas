(ns hello
  (:gen-class
    :methods [^:static [handler [String] String]]))

(defn -handler [s]
  (println "blah" s)
  (str "Hello there " s "!"))