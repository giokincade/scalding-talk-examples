package com.giokincade.scalding
import com.twitter.scalding._

class TypedPipeExampleJob(args: Args) 
  extends Job(args) {

  TypedPipe.from(
      TextLine("data/words.txt")
    )
    .map(line => line.substring(0,1)) 
    .groupBy(character => character)
    .size
    .write(TypedTsv[(String, Long)]("data/output/typed-characters.tsv"))
}
