# Java Calculator App

Javaの基本構文と例外処理の学習を目的とした、コンソール型の四則演算アプリケーションです。

---

## 機能一覧

- [x] 加算（+）
- [x] 減算（-）
- [x] 乗算（*）
- [x] 除算（/）
- [x] 0除算時の例外処理
- [x] 数値以外の入力時にエラーメッセージ表示

---

## 実行方法

1. Eclipseでプロジェクトを開く
2. `Main.java` を右クリック → `実行`
3. コンソール上で数値・演算子を入力
4. 結果が表示される

---

## 使用技術

- Java 17
- Eclipse IDE
- JUnit 5（単体テスト）

---

## テストの実行（JUnit）

1. Eclipse の `CalculatorTest.java` を右クリック → `テストとして実行`
2. テストケース一覧が表示される

---

## ディレクトリ構成

<pre>
calculator-app/
├── src/
│ ├── Main.java
│ └── Calculator.java
├── test/
│ └── CalculatorTest.java
├── docs/
│ └── design.md
├── .gitignore
└── README.md
</pre>

---

## 補足

- 除算メソッドは `0` のとき `ArithmeticException` をスローします
- 入力が数字でない場合は `InputMismatchException` をキャッチしてエラー表示します
