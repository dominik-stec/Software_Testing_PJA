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

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/dccstcc/TAU_PJATK_practice)

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
    <a href="https://github.com/dccstcc/TAU_PJATK_practice/tree/master/lab_1_3_JUnit_Mockito/"><strong>» go to CODE »</strong></a>
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

<p> In this project I tested different cars marks factory. I used JUnit library for unit tests and Mockito library for mocking dependencies in cars factory. Project is maintain by Maven build tools. This tests run by Docker images. </p>

### Built With

This project use technology below.
* [![docker][docker-shield]][docker-url]
* [![junit][junit-shield]][junit-url]
* [![mockito][mockito-shield]][mockito-url]
* [![maven][maven-shield]][maven-url]


<!-- GETTING STARTED -->
## Getting Started

This is instructions on setting up this project locally.


### Prerequisites

Docker for build images is required. <br />
JUnit unit test framework for Java is need. <br />
Mockito framework for use in JUnit stubs/mocks is need. <br />
Apache Maven project build tools is need. <br />

* Docker
  ```sh
  sudo apt-get install docker-engine -y
  sudo service docker start
  ```
* Maven
   ```sh
  wget http://www.apache.org/dist//maven/binaries/apache-maven-3.0.3-bin.tar.gz
  tar -zxvf apache-maven-3.0.3-bin.tar.gz
  nano .bashrc
  ```
  into .bashrc on the end of file paste:
  ```sh
  export M2_HOME=/opt/apache-maven-3.0.3
  export PATH=${M2_HOME}/bin:${PATH}
  ```
  hit Ctrl+O to save <br />
  hit Ctrl+X to exit

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/dccstcc/TAU_PJATK_practice.git
   ```
2. Go to folder with Maven project sources
   ```sh
   cd lab_1_3_JUnit_Mockito
   ```
3. Build Docker image
   ```sh
   docker build --tag docker_tests .
   ```
4. Run Docker image
   ```sh
   docker run -it docker_tests
   ```
5. Run tests using Maven
   ```sh
   mvn test
   ```

[![build_docker_image][build]][build]


<!-- USAGE EXAMPLES -->
## Usage

After hit command
   ```sh
   mvn test
   ```
it is posiible to verify number of tests and check if test pass or fail into command line output.

[![run_docker_image][run]][run]

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

This project has not a license. All rights are reserved and it is not Open Source or free. You cannot modify or redistribute this code without explicit permission from the copyright holder. Because projects I realised are my materials from PJATK studies. See LICENSE for more information.



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

[build]: images/build.png
[run]: images/run.png


