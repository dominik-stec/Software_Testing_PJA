<!--
*** Thanks for checking out c. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]
[![NO LICENSE][license-shield]][license-url]


<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://gdansk.pja.edu.pl/pl/">
    <img src="images/logo.jpg" alt="Logo" width="540" height="80">
  </a>

  <h2 align="center">TAU_PJATK_practice</h2>

  <p align="center">
    <h3> Testing technology subject in PJATK </h3>
    <br />
    <a href="https://github.com/dccstcc/TAU_PJATK_practice/tree/master/lab_6_Selenium/new"><strong>» go to CODE »</strong></a>
    <br />
    <br />
    <!-- <a href="https://github.com/othneildrew/Best-README-Template">View Demo</a>
    ·
    <a href="https://github.com/othneildrew/Best-README-Template/issues">Report Bug</a>
    ·
    <a href="https://github.com/othneildrew/Best-README-Template/issues">Request Feature</a> -->
  </p>
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <!-- <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li> -->
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <!-- <li><a href="#acknowledgements">Acknowledgements</a></li> -->
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

<p> In this project I tested efficiency with Apache JMeter library. This test checks simple rest api under stress controled by framework. </p>

### Built With

This project use technology below.
* [![jmeter][jmeter-shield]][jmeter-url]
* [![maven][maven-shield]][maven-url]
* [![jetty][jetty-shield]][jetty-url]


<!-- GETTING STARTED -->
## Getting Started

This is instructions on setting up this project locally.


### Prerequisites

JMeter framework to load test functional behavior and measure performance is need. <br />
Apache Maven project build tools is need. <br />
Eclipse Jetty server with web container is need. <br />

* Maven
   ```sh
  mkdir ~/maven
  cd ~/maven
  https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
  tar xzvf apache-maven-3.8.6-bin.tar.gz
  nano .bashrc
  ```
  into .bashrc on the end of file paste:
  ```sh
  export M2_HOME=~/maven/apache-maven-3.8.6/bin/
  export PATH=${M2_HOME}/bin:${PATH}
  ```
  hit `Ctrl+O` to save <br />
  hit `Ctrl+X` to exit

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/dccstcc/TAU_PJATK_practice.git
   ```
2. Go to folder with HsqlDB server script and execute them
   ```sh
   cd lab_5_Jmeter/restdemo/scripts
   chmod 777 ./server.sh
   ./server.sh &
   ```
   Pay attention to PID of running server
   
3. Go to folder with HsqlDB client script and execute them
   ```sh
   cd lab_5_Jmeter/restdemo/scripts
   chmod 777 ./client.sh
   ./client.sh &   
   ```
   
4. Unzip JMeter library
   ```sh
   cd lab_5_Jmeter/
   gzip -d apache-jmeter-5.2.1.zip
   ./client.sh &   
   ```

5. Move hsqldb.jar to jmeter lib
   ```sh
   mv hsqldb.jar ./apache-jmeter-5.2.1/lib/ 
   ```

 <img src="images/server_run.png" width="500"/>

<!-- [![server_run][server_run]][server_run] -->

<!-- [![client_run][client_run]][client_run] -->

<img src="images/client_run.png" width="500"/>

<img src="images/client.png" width="500"/>

<!-- [![client][client]][client] -->



<!-- USAGE EXAMPLES -->
## Usage

Run rest api service built with cooperation with HsqlDB database and Jetty web container.  
   ```sh
   mvn jetty:run
   ```

 <img src="images/jetty_run.png" width="500"/>

<!-- [![jetty_run][jetty_run]][jetty_run] -->


In browser go to url 0.0.0.0/api:8080 and check if it is the same url like display after execute command  
   ```sh
   mvn jetty:run
   ```
   
 <img src="images/browser.png" width="500"/>
   
<!-- [![browser][browser]][browser]
 -->

Next step is to run the Jmeter framework with rest api server url and Jmeter config file
   ```sh
   cd ./apache-jmeter-5.2.1/
   ./jmeter -n -t ../../TAU_lab4_JMeter.jmx -l log.jtl -H 0.0.0.0/api -P 8080
   ```

<img src="images/summary.png" width="500"/>

<!-- [![summary][summary]][summary] -->

After run tests into command line output it is possible to see summary of measurements regarding efficiency.

For exit rest service maintained by Jetty just hit <br />
`CTRL+C`

Now we can exit database server by use server PID system number
   ```sh
   kill #PID#
   ```

<!-- _For more examples, please refer to the [Documentation](https://example.com)_ -->



<!-- ROADMAP 
## Roadmap

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a list of proposed features (and known issues).

-->

<!-- CONTRIBUTING 
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

-->

<!-- LICENSE -->
## License

This project has not a license. All rights are reserved and it is not Open Source or free. You cannot modify or redistribute this code without explicit permission from the copyright holder. Because projects I realised are my materials from PJATK studies. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Dominik Stec - dccstcc@gmail.com

[![LinkedIn][linkedin-shield]][linkedin-url]

Project URL: 
<br />
`https://github.com/dccstcc/TAU_PJATK_practice.git`



<!-- ACKNOWLEDGEMENTS 
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Pages](https://pages.github.com)
* [Animate.css](https://daneden.github.io/animate.css)
* [Loaders.css](https://connoratherton.com/loaders)
* [Slick Carousel](https://kenwheeler.github.io/slick)
* [Smooth Scroll](https://github.com/cferdinandi/smooth-scroll)
* [Sticky Kit](http://leafo.net/sticky-kit)
* [JVectorMap](http://jvectormap.com)
* [Font Awesome](https://fontawesome.com)

-->



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/dccstcc/TAU_PJATK_practice.svg?style=for-the-badge
[contributors-url]: https://github.com/dccstcc/TAU_PJATK_practice/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/dccstcc/TAU_PJATK_practice.svg?style=for-the-badge
[forks-url]: https://github.com/dccstcc/TAU_PJATK_practice/network/members
[stars-shield]: https://img.shields.io/github/stars/dccstcc/TAU_PJATK_practice.svg?style=for-the-badge
[stars-url]: https://github.com/dccstcc/TAU_PJATK_practice/stargazers
[issues-shield]: https://img.shields.io/github/issues/dccstcc/TAU_PJATK_practice.svg?style=for-the-badge
[issues-url]: https://github.com/dccstcc/TAU_PJATK_practice/issues
[license-shield]: https://img.shields.io/badge/License-NONE-orange
[license-url]: https://github.com/dccstcc/TAU_PJATK_practice/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/dominik-stec
[product-screenshot]: images/screenshot.png

[junit-shield]: https://img.shields.io/badge/-JUnit-green
[junit-url]: https://junit.org/junit5/
[mockito-shield]: https://img.shields.io/badge/-Mockito-red
[mockito-url]: https://site.mockito.org/
[docker-shield]: https://img.shields.io/badge/-Docker-blue
[docker-url]: https://www.docker.com/
[maven-shield]: https://img.shields.io/badge/-Maven-white
[maven-url]: https://maven.apache.org/
[cucumber-shield]: https://img.shields.io/badge/-Cucumber-green
[cucumber-url]: https://cucumber.io/
[jetty-shield]: https://img.shields.io/badge/-Jetty-red
[jetty-url]: https://www.eclipse.org/jetty/
[jmeter-shield]: https://img.shields.io/badge/-Jmeter-green
[jmeter-url]: https://jmeter.apache.org/

[server_run]: images/server_run.png 
[client_run]: images/client_run.png
[client]: images/client.png
[jetty_run]: images/jetty_run.png
[browser]: images/browser.png
[summary]: images/summary.png



