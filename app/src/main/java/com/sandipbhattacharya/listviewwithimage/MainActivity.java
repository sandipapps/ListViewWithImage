package com.sandipbhattacharya.listviewwithimage;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    /*
    Image Credit:
    Images in this tutorial are originally made by Konpa (under MIT License)
    Link for download: https://devicons.github.io/devicon/
    License: https://github.com/devicons/devicon/blob/master/LICENSE
     */

    // Create a ListView object reference
    ListView lvProgram;
    // Next, prepare your data set. Create two string arrays for program name and program description respectively.
    String[] programName = {"C", "C++", "Java", "Android", "HTML5", "CSS3", "JavaScript", "jQuery", "Bootstrap", "PHP",
            "MySQL", "CodeIgniter", "React", "NodeJS", "AngularJS", "PostgreSQL", "Python", "C#", "Wordpress", "GitHub"};
    String[] programDescription = {"C Description", "C++ Description", "Java Description",
            "Android Description", "HTML5 Description",
            "CSS3 Description", "JavaScript Description", "jQuery Description",
            "Bootstrap Description", "PHP Description", "MySQL Description",
            "CodeIgniter Description", "React Description", "NodeJS Description",
            "AngularJS Description", "PostgreSQL Description", "Python Description",
            "C# Description", "Wordpress Description", "GitHub Description"};
    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.c, R.drawable.cplusplus,
            R.drawable.java, R.drawable.android, R.drawable.html5,
            R.drawable.css3, R.drawable.javascript, R.drawable.jquery,
            R.drawable.bootstrap, R.drawable.php, R.drawable.mysql,
            R.drawable.codeigniter, R.drawable.react, R.drawable.nodejs,
            R.drawable.angularjs, R.drawable.postgresql, R.drawable.python,
            R.drawable.csharp, R.drawable.wordpress, R.drawable.github};

    /*
    Additional code
    String[] urls = {"https://en.wikipedia.org/wiki/C_(programming_language)",
            "https://en.wikipedia.org/wiki/C%2B%2B",
            "https://en.wikipedia.org/wiki/Java_(programming_language)",
            "https://en.wikipedia.org/wiki/Android_(operating_system)",
            "https://en.wikipedia.org/wiki/HTML5",
            "https://en.wikipedia.org/wiki/CSS3_(disambiguation)",
            "https://en.wikipedia.org/wiki/JavaScript",
            "https://en.wikipedia.org/wiki/JQuery",
            "https://en.wikipedia.org/wiki/Bootstrap_(front-end_framework)",
            "https://en.wikipedia.org/wiki/PHP",
            "https://en.wikipedia.org/wiki/MySQL",
            "https://en.wikipedia.org/wiki/CodeIgniter",
            "https://en.wikipedia.org/wiki/React_(web_framework)",
            "https://en.wikipedia.org/wiki/Node.js",
            "https://en.wikipedia.org/wiki/AngularJS",
            "https://en.wikipedia.org/wiki/PostgreSQL",
            "https://en.wikipedia.org/wiki/Python_(programming_language)",
            "https://en.wikipedia.org/wiki/C_Sharp_(programming_language)",
            "https://en.wikipedia.org/wiki/WordPress",
            "https://en.wikipedia.org/wiki/GitHub"};
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the handle for ListView
        lvProgram = findViewById(R.id.lvProgram);
        // Specify an adapter and pass context along with all the arrays in constructor
        ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription);
        //ProgramAdapter programAdapter = new ProgramAdapter(this, programName, programImages, programDescription, urls);

        // Set the adapter with the ListView
        lvProgram.setAdapter(programAdapter);
    }
}