package com.giokincade.scalding

import org.apache.hadoop.util.ToolRunner
import org.apache.hadoop.conf.Configuration
import com.twitter.scalding.Tool

object Runner {
  def main(args: Array[String]) {
    ToolRunner.run(new Configuration, new Tool, args);
  }
}
