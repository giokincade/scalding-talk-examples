package com.giokincade.scalding
import com.twitter.scalding._

class ExampleJob(args: Args) 
  extends Job(args) {

  TextLine("data/words.txt")
    .map('line -> 'first_character) {
      (line:String) =>
        line.substring(0,1)
  }
  .groupBy('first_character) {
    (g: GroupBuilder) =>
      g.size('size)
  }
  .write(Tsv("data/output/field-characters.tsv"))
}
