extends Control

var GodotAndroidEssentials = null

func _ready():
	if(Engine.has_singleton("GodotAndroidEssentials")):
		print("GodotAndroidEssentials found")
		GodotAndroidEssentials = Engine.get_singleton("GodotAndroidEssentials")

	else:
		print("GodotAndroidEssentials Not found")
	pass
	


func _on_Button_pressed():
	if GodotAndroidEssentials:
		GodotAndroidEssentials.showToast("Hey! this message is from godot", "long")
	
	pass # Replace with function body.
