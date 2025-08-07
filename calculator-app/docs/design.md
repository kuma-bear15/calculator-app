# 計算機アプリ 設計書

## 概要

本アプリは Java で作成された簡単な計算機アプリで、四則演算（加算、減算、乗算、除算）を行います。
ユーザーは数値2つと演算子（+ - * /）を入力し、結果を出力します。

---

## システム構成（構成図）

Main.java
└─ ユーザー入力（Scanner）
└─ 計算ロジック（Calculatorクラス呼び出し）
├─ add()
├─ subtract()
├─ multiply()
└─ divide()：0除算で例外スロー

---

## クラス設計

### Calculator.java

| メソッド名 | 説明 |
|------------|------|
| `add(double a, double b)` | 加算 |
| `subtract(double a, double b)` | 減算 |
| `multiply(double a, double b)` | 乗算 |
| `divide(double a, double b)` | 除算（0のときは `ArithmeticException`） |

### Main.java

- ユーザー入力の受付（Scanner）
- 入力値のバリデーション（数値/演算子）
- 計算実行と結果出力
- `InputMismatchException` や `ArithmeticException` を処理

---

## 入出力仕様

| 項目 | 内容 |
|------|------|
| 入力1 | 数値（double） |
| 入力2 | 演算子（`+ - * /`） |
| 入力3 | 数値（double） |
| 出力 | 演算結果 または エラーメッセージ |

---

## 想定されるエラー処理

- 数値以外 → エラー表示後終了
- 無効な演算子 → エラー表示後終了
- 0除算 → 例外スロー → catchしてエラーメッセージ表示