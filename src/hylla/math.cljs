(ns hylla.math)

(defn ceil [x]
  (.ceil js/Math x))

(defn floor [x]
  (.floor js/Math x))

(defn round [x]
  (.round js/Math x))