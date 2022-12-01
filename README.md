# Raytracing_Engine 
> The project for Computer Graphics course.
You are the  ![](https://visitor-badge.glitch.me/badge?page_id=mnhwt0108.Raytracing_Engine)!

# Introduction
A renderer engine using ray-tracing technique from scratch in Java

<h4>Member</h4>

| Number | ID | Name | Task allocation | 
| ----- | ----- | --------- | --------- | 
| 1  | ITITWE19024 | [Dương Minh Nhựt](https://github.com/mnhwt0108) | Optimization, Secondary rays |
| 2 | ITITIU19182 | [Phạm Trần Anh Phúc](https://github.com/phucide) | Lights, Render |
| 3  |  ITITIU19067 | [Lê Hữu Sỹ](https://github.com/Ted1804) | User Interface, Render |

<h4>Motivation</h4> 
<p>Our team all had an interest in computer graphics in general and wanted to use this oppoturnity to implement a project that we all like, that being the process of rendering, specificly the ray-tracing rendering process.</p>
<p>Thanks to the analysis with much studies through documents and a whole lot of physics, every member on the team can recognize and understand its core problems, solutions, methodologies and implemented it with small inputs and libraries together.</p>

<h4>Present slides: <a href=https://docs.google.com/presentation/d/1UW2u11niXyFSKFKa2w1EqSfpAUKzaF40SPl-FSYIqd0/edit?usp=sharing> here </a> </h4>


<h2 id="table-of-contents"> :book: Table of Contents</h2>
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#general-information">General Information</a></li>
    <li><a href="#features">Features</a></li>
    <li><a href="#technologies">Technologies</a></li>
    <li><a href="#folder-structure">Folder Structure</a></li>
    <li><a href="#screenshot">Screenshot</a></li>
    <li><a href="#acknowledge">Acknowledge</a></li>
  </ol>
</details>

<h2 id="general-information"> 🧮 General Information</h2>

- **GUI** : Simple GUI implemented through Netbean IDE.
- **Renderer** : The raytracer implemented from stratch using vecmath library.

<h2 id="features"> 📋 Features</h2>

List the ready features here:

| Field | Functions | 
| ----- | ----- |
| Scene  | Add light - Import mesh - Import scene - Duplicate mesh - Remove light, mesh - Save scene - Load scene |
| Object | Change name - Translate position - Transform scale - Change object settings (color, reflection, refraction, etc..) |
| Camera | Change position - Change target - Change vector up - Change field of view - Targer an object |
| Render | Change window height and width -  Change shadow type - Antialiasing amount - Acceleration - Output image |


<h2 id="technologies"> 🖥️ Technologies</h2>

### - Libraries
| Library | README |
| ------ | ------ |
| vecmath | [javax.vecmath doc](https://docs.oracle.com/cd/E17802_01/j2se/javase/technologies/desktop/java3d/forDevelopers/j3dapi/javax/vecmath/package-summary.html) |

<h2 id="folder-structure"> 🗺️ Folder Structure</h2>
   
    ├── GUI
    ├── accelerators
    ├── demo
    ├── geometry
    ├── objects
    ├── parser
    ├── raytracer
    ├── res
    ├── scene
    ├── scene
    
<h2 id="diagram"> 🖥 Diagrams </h2>

<h3> Class diagram </h3> 

![](https://cdn.discordapp.com/attachments/919497044110999606/1047878751322640515/image.png)

<h3> Sequence diagram </h3> 

|                                        Request render                                        | 
| :--------------------------------------------------------------------------------: |
| ![](https://cdn.discordapp.com/attachments/919497044110999606/1047878919925289000/image.png) | 

<h2 id="screenshot"> 📸 Screenshots </h2>

### User Interface
|                                        Main Panel                                        |                                        Render Settings                                |                                        Object Settings                                        | 
| :--------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------: |
| ![](https://cdn.discordapp.com/attachments/919497044110999606/1047880311310135396/image.png) | ![](https://cdn.discordapp.com/attachments/919497044110999606/1047880452867895396/image.png) | ![](https://cdn.discordapp.com/attachments/919497044110999606/1047880142631993424/image.png) | 

### Results
<table>
    <thead>
        <tr>
            <th colspan=2>Computer used to render</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td >CPU</td>
            <td >Intel(R) Core(TM) i7-6700HQ CPU @2.60GHz</td>
        </tr>
        <tr>
            <td >GPU</td>
            <td >NVIDIA GeForce GTX 965M</td>
        </tr>
        <tr>
            <td >RAM</td>
            <td >16GB</td>
        </tr>
    </tbody>
</table>


|                                        Reflective Sphere                                        |                                        Standford University's Buddha Model                              |
| :--------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: |
| ![](https://github.com/mnhwt0108/Raytracing_Engine/blob/main/Out/test_light.png) | ![](https://github.com/mnhwt0108/Raytracing_Engine/blob/main/Out/buddha.png) | 

|                                        Sphere In Room                                        |                                        Standford University's Bunny Model                                |
| :--------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: |
| ![](https://github.com/mnhwt0108/Raytracing_Engine/blob/main/Out/sphere_in_room.png) | ![](https://github.com/mnhwt0108/Raytracing_Engine/blob/main/Out/bunny.png) |

### Super Sampling Antialiasing
|                                        None                                        |                                        x4                               |                                        x9                                       |
| :--------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------: |
| ![](https://cdn.discordapp.com/attachments/919497044110999606/1047882142006394910/image.png) | ![](https://cdn.discordapp.com/attachments/919497044110999606/1047882142371287090/image.png) | ![](https://cdn.discordapp.com/attachments/919497044110999606/1047882142790733864/image.png) |

<h2 id="acknowledge"> 💼 Acknowledgement </h2>

- With deep gratitude and respect, we acknowledge the professional guidance of Dr. Nguyen Van Sinh and Dr. Le Duy Tan. The constant support and knowledge provided by the course helped us achieve our goals of successfully implenting the renderer.
### Future Features
-  Rotation transform
-  Render more complex meshes
-  An easier way to move objects and the camera
-  More optimization
-  Real time render

### What We Learnt
- How the raytracing technique work
- The core problems and solutions of raytracing
- Usage of different libaries, computer graphics logic 
- Usage of Git, pull, merge and commit
- Organize files to better manage development
- Communication between members
- Importance of thesis report
