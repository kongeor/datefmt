(ns datefmt.core
  (:require [clj-time.core :as t]
            [clj-time.format :as f]))

(def fmt (f/formatter  "dd MMM yyyy"))

(defn fmt-date [d]
  (f/parse fmt d))
