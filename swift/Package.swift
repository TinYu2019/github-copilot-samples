// swift-tools-version:5.3
import PackageDescription

let package = Package(
    name: "MySwiftApp",
    platforms: [
        .iOS(.v14)
    ],
    products: [
        .executable(name: "MySwiftApp", targets: ["MySwiftApp"])
    ],
    dependencies: [
        // Add dependencies here
    ],
    targets: [
        .target(
            name: "MySwiftApp",
            dependencies: [],
            path: "Sources",
            exclude: ["../README.md"]
        ),
        .testTarget(
            name: "MySwiftAppTests",
            dependencies: ["MySwiftApp"],
            path: "Tests"
        )
    ]
)
