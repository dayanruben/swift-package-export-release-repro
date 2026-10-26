import Composables
import SwiftUI

@main
struct SwiftPackageExportReproApp: App {
    var body: some Scene {
        WindowGroup {
            Text(Greeting().message())
        }
    }
}
