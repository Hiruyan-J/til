# string型に対する`include`と`index`の動作の違い

word = "Hello world!"
search = "ll"

# 検索対象が文字列にある場合
search = "ll"
puts "- include:#{word.include?(search)}"
puts "- index:#{word.index(search)}"


puts "----------"

# 検索対象が文字列にない場合
search = "xx"
puts "- include:#{word.include?(search)}"
puts "- index:#{word.index(search)}"
puts "- index is nil?:#{word.index(search).nil?}"