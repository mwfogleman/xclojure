(ns diamond-test
  (:require  [clojure.test :refer [deftest is]]
             [diamond]))

(deftest a-test
  (is (= ["A"]
         (diamond "A"))))

(deftest b-test
  (is (= [" A "
          "B B"
          " A "]
         (diamond "B"))))

(deftest c-test
  (is (= ["  A  "
          " B B "
          "C   C"
          " B B "
          "  A  "]
         (diamond "C"))))

(deftest d-test
  (is (=
       ["   A   "
        "  B B  "
        " C   C "
        "D     D"
        " C   C "
        "  B B  "
        "   A   "]
       (diamond "D"))))

(deftest largest-possible-diamond
  (is (=
       ["                         A                         "
        "                        B B                        "
        "                       C   C                       "
        "                      D     D                      "
        "                     E       E                     "
        "                    F         F                    "
        "                   G           G                   "
        "                  H             H                  "
        "                 I               I                 "
        "                J                 J                "
        "               K                   K               "
        "              L                     L              "
        "             M                       M             "
        "            N                         N            "
        "           O                           O           "
        "          P                             P          "
        "         Q                               Q         "
        "        R                                 R        "
        "       S                                   S       "
        "      T                                     T      "
        "     U                                       U     "
        "    V                                         V    "
        "   W                                           W   "
        "  X                                             X  "
        " Y                                               Y "
        "Z                                                 Z"
        " Y                                               Y "
        "  X                                             X  "
        "   W                                           W   "
        "    V                                         V    "
        "     U                                       U     "
        "      T                                     T      "
        "       S                                   S       "
        "        R                                 R        "
        "         Q                               Q         "
        "          P                             P          "
        "           O                           O           "
        "            N                         N            "
        "             M                       M             "
        "              L                     L              "
        "               K                   K               "
        "                J                 J                "
        "                 I               I                 "
        "                  H             H                  "
        "                   G           G                   "
        "                    F         F                    "
        "                     E       E                     "
        "                      D     D                      "
        "                       C   C                       "
        "                        B B                        "
        "                         A                         "]
       (diamond "Z"))))
