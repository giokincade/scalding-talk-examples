package com.giokincade.scalding

import org.apache.hadoop.util.ToolRunner
import org.apache.hadoop.conf.Configuration

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
  .write(Tsv("data/output/characters.tsv"))
  
}

object ExampleJob {
  def main(args: Array[String]) {
    ToolRunner.run(new Configuration, new Tool, args);
  }
}
